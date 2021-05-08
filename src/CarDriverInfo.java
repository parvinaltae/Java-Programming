public class CarDriverInfo {
    public static void main(String[] args){
        String carModel= ("G63");
        String driverName=("Parvin");
        String licenseNum=("ClaVie");
        byte speed=120;
        boolean automatic=true;
        char licenseClass='D';
        System.out.println("Car Model is : "+carModel+"\n" +("Driver name is : ")+driverName);
        System.out.println("License Number is : "+licenseNum+"\n"+("Speed is: ")+speed);
        System.out.println("Automatic is: "+automatic+"\n"+("License Class is: ")+licenseClass);
//        Below is String + char, that works though it not ""
        System.out.println(carModel+licenseClass);
        System.out.println(10+15);

    }
}
