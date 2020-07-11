package hw6Q2Abstraction04;

import javax.swing.AbstractAction;

public class TestInstitute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//College.studyroom();
				System.out.println("\n-------- Columbia University --------\n"); //concrete class
				ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
				columbiaUniversity.biology();
				columbiaUniversity.anatomyLab();
				columbiaUniversity.biochemistryLab();
				columbiaUniversity.caring();
				columbiaUniversity.hygine();
				columbiaUniversity.statistics();
				columbiaUniversity.mechanicalLab();
				columbiaUniversity.computerLab();
				columbiaUniversity.physics();
			    //static  method CANNOT be called
				columbiaUniversity.gymnesium();
				columbiaUniversity.classSize();
				columbiaUniversity.field();
				columbiaUniversity.teacher();
				columbiaUniversity.dorm();
				columbiaUniversity.laboratory();
				columbiaUniversity.languageClub();
				columbiaUniversity.commonRoom();
				columbiaUniversity.emergencyRoom();
				columbiaUniversity.surgeryRoom();
				columbiaUniversity.cafeteria();
				columbiaUniversity.morgue();
				columbiaUniversity.vocationalInfo();
				
				
				System.out.println("\n-------- Rockefeller University --------\n"); //concrete class
				RockefellerUniversity rockefellerUniversity = new RockefellerUniversity();
				rockefellerUniversity.statistics();
				rockefellerUniversity.mechanicalLab();
				rockefellerUniversity.computerLab();
				rockefellerUniversity.physics();
				rockefellerUniversity.aeronauticalInfo();
				rockefellerUniversity.computerLab();
				rockefellerUniversity.mechanicalLab();
				rockefellerUniversity.physics();
				
				System.out.println("\n-------- University --------\n"); //interface
				University university  = new ColumbiaUniversity();
				university.cafeteria();
				university.classSize();
				university.gymnesium();
				university.field();
				university.teacher();
				university.dorm();
				university.laboratory();
				university.languageClub();
				university.commonRoom();
				university.emergencyRoom();
				university.surgeryRoom();
				university.morgue();
				
				System.out.println("\n-------- Hospital --------\n"); //interface
				Hospital hospital = new ColumbiaUniversity();
				hospital.emergencyRoom();
				hospital.cafeteria();
				hospital.surgeryRoom();
				hospital.morgue();
				College.studyroom();
				
				System.out.println("\n-------- Medical School --------\n"); //abstract class
				MedicalSchool medicalSchool = new ColumbiaUniversity();
				medicalSchool.anatomyLab();
				medicalSchool.biochemistryLab();
				medicalSchool.hygine();
				medicalSchool.caring();
				medicalSchool.aeronauticalInfo();
				medicalSchool.computerLab();
				medicalSchool.mechanicalLab();
				medicalSchool.computerLab();
				medicalSchool.physics();
				
				System.out.println("\n-------- Nursing School --------\n"); //abstract class
				NursingSchool nursingSchool = new ColumbiaUniversity();
				nursingSchool.hygine();
				nursingSchool.caring();
				nursingSchool.statistics();
				nursingSchool.aeronauticalInfo();
				nursingSchool.computerLab();
				nursingSchool.mechanicalLab();
				nursingSchool.computerLab();
				
				System.out.println("\n-------- Engineering School --------\n"); //abstract class
				EngineeringSchool engineeringSchool = new RockefellerUniversity();
				engineeringSchool.computerLab();
				engineeringSchool.mechanicalLab();
				engineeringSchool.physics();
	}

}
