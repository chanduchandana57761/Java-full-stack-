 class UniversityMember {
    int memberId;   
    void checkMemberId() {
        System.out.println("MembercheckedIn");
    }
 }
 class Staff extends UniversityMember {
    String department;
    void attendMeeting() {
        System.out.println("StaffattendingMeeting");

    }
 }
 class professor extends Staff {
    String subject;
    void conductLecture() {
        System.out.println("ProfessorconductingLecture");
    }
 }  
 class AdminOfficer extends Staff {
    String office;
    void processFiles() {
        System.out.println("AdminOfficerprocessingFiles");  
    }
 }
 class Hybridinheritance {
    public static void main(String[] args) {
        professor p = new professor();
        p.memberId = 123;
        p.department = "ComputerScience";
        p.subject = "Java";
        System.out.println("Professor Details");
        p.checkMemberId();
        p.attendMeeting();
        p.conductLecture();

        AdminOfficer a = new AdminOfficer();
        a.memberId = 456;
        a.department = "Administration";
        a.office = "MainOffice";
        System.out.println("Admin Officer Details");
        a.checkMemberId();
        a.attendMeeting();
        a.processFiles();
    }
}
