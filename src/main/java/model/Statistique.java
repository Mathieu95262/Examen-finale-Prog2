package model;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Statistics {

    public static List<Frais> getLateFees(List<Frais> fees, LocalDate currentDate) {
        return fees.stream()
                .filter(fee -> fee.getStatus(currentDate) == FraisStatus.LATE)
                .collect(Collectors.toList());
    }

    public static double getTotalMissingFees(List<Frais> fees, LocalDate currentDate) {
        return fees.stream()
                .filter(fee -> fee.getStatus(currentDate) == FraisStatus.LATE)
                .mapToDouble(fee -> fee.getMontantaPayer() - fee.getTotalPaye())
                .sum();
    }

    public static double getTotalPaidByStudent(Etudiants student, List<Frais> fees, LocalDate currentDate) {
        return fees.stream()
                .filter(fee -> fee.getEtudiant().equals(student))
                .mapToDouble(Frais::getTotalPaye)
                .sum();
    }
}