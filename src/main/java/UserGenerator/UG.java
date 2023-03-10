package UserGenerator;

import java.util.UUID;

public class UG {
        public static String genName(){
            String[] name = {"Kristen", "Claire", "Lea",
                    "Ines", "Frances", "Kobi",
                    "Keelan", "Mattie", "Ollie",
                    "Sasha", "Nevaeh", "Pearl",
                    "Jaydon", "Hayden", "Cory",
                    "Kaden", "Harri", "Regan"};
            int in = (int) (Math.random() * name.length);
            return name[in];
        }

        public static String genLastName(){
            String[] lastName ={"Charles","Mccall", "Foster",
                    "O'Sullivan","Dunlap","Mack",
                    "Andrews","Bloggs","Nichols",
                    "Summers","Wilkinson","Hull",
                    "Stokes","Ramirez","Hodges",
                    "Klein","Singleton","Ayers"};
            int in = (int) (Math.random() * lastName.length);
            return lastName[in];
        }

    public static String genStreet(){
        String[] street ={"33 Carpenter Street","8798 Magnolia Road",
                "15 North Del Monte St", "9280 Wild Horse Lane",
                "973 N. School Dr", "35 Alderwood Dr"};
        int in = (int) (Math.random() * street.length);
        return street[in];
    }

    public static String genUserName(){
        return new StringBuilder(genName().toLowerCase()).reverse().toString();
    }

    public static int ageGen(){
        return (int) (Math.random()*130);
    }

    public static UUID idGen(){
        return UUID.randomUUID();
    }

    public static String phoneGen(){
        String num1 = Integer.toString(100+(int) (Math.random()*899));
        String num2 = Integer.toString(100+(int) (Math.random()*899));
        String num3 = Integer.toString(100+(int) (Math.random()*8999));

        return ("8"+num1+num2+num3);
    }

    public static String emailGen(){
        return genName().toLowerCase()+genLastName().toLowerCase()+"@mail.ru";
    }
}
