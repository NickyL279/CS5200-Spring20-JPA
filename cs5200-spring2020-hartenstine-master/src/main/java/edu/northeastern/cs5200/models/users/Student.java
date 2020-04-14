package edu.northeastern.cs5200.models.users;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Student extends User{
    private Boolean verified;
    private Boolean userAgreement;

//    @OneToMany(mappedBy = "resume")
//    private List<Resume> studentResumes;

    @OneToMany(mappedBy = "student")
    private List<Application> applications;
    public Student() {}

//    public Student(Boolean verified, Boolean userAgreement) {
//        this.verified = verified;
//        this.userAgreement = userAgreement;
//        this.studentResumes = studentResumes;
//    }
//
//    public Student(int id, String firstName, String lastName, String username, String password, Boolean verified, Boolean userAgreement, List<Resume> studentResumes) {
//        super(id, firstName, lastName, username, password);
//        this.verified = verified;
//        this.userAgreement = userAgreement;
//        this.studentResumes = studentResumes;
//    }

    public Student(String firstName, String lastName, String username, String password, Boolean verified, Boolean userAgreement) {
        super(firstName, lastName, username, password);
        this.verified = verified;
        this.userAgreement = userAgreement;
    }
    public void addApplication(Application a) {
        applications.add(a);
    }

    public void removeApplication(Application a) {
        applications.remove(a);
    }
    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Boolean getUserAgreement() {
        return userAgreement;
    }

    public void setUserAgreement(Boolean userAgreement) {
        this.userAgreement = userAgreement;
    }

//    public List<Resume> getStudentResumes() {
//        return studentResumes;
//    }
//
//    public void setStudentResumes(List<Resume> studentResumes) {
//        this.studentResumes = studentResumes;
//    }
}
