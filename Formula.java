import java.util.Scanner;

public class Formula {
    public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();
}
    public static void main(String[] args) {
        int select01, select02, select03, select04, squareside, perimeterOfSquare, recLen, recWid, perimeterOfREc, trisideA, trisideB, trisideC, perimeterOfTriangle, AreaOfSquare, tribase, triheight, parrbase ,parrheight, AreaOfParr, cubeside, VolofCube, len, wid, height, VolOfRecPrism ;
        double perimeterOfCircle, radius, AreaOfREc, AreaofTri, AreaOfCircle, VolOfCylinder, VolOfPyramid, VolOfSphere;
        char tryloop;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("********Formula For?********\nChoose among the following:\n [1] Perimeter\n [2] Area\n [3] Volume");
            System.out.print("Enter choice: ");
            select01 = sc.nextInt();
            clearScreen();
            switch (select01) {
                case 1:
                    System.out.println("*****Perimeter******");
                    System.out.println("Choose Shape: \n [1] Square\n [2] Rectangle\n [3] Triangel\n [4] Circle");
                    System.out.print("Enter choice: ");
                    select02 = sc.nextInt();
                    clearScreen();
                    if (select02 == 1) {
                        System.out.println("*****Square*****");
                        System.out.print("Enter the side of Square: ");
                        squareside = sc.nextInt();
                        perimeterOfSquare = squareside * 4;
                        System.out.printf("The Perimter of Square is: %d", perimeterOfSquare);                  

                    }else if(select02 == 2){
                        System.out.println("*****Rectangle*****");
                        System.out.print("Enter the Length of the Rectangle: ");
                        recLen = sc.nextInt();
                        System.out.print("Enter the Width of the Rectangle: ");
                        recWid = sc.nextInt();
                        perimeterOfREc = (2 * recLen) + (2 * recWid);
                        System.out.printf("The Perimeter of Rectangle is: %d", perimeterOfREc);

                    } else if(select02 == 3){
                        System.out.println("*****Triangle*****");
                        System.out.println("Enter the Sides of Triangle!");
                        System.out.print("Side 1: ");
                        trisideA = sc.nextInt();
                        System.out.print("Side 2: ");
                        trisideB = sc.nextInt();
                        System.out.print("Side 3: ");
                        trisideC = sc.nextInt();
                        perimeterOfTriangle = trisideA + trisideB + trisideC;
                        System.out.printf("The Perimeter of Triangle is: %d", perimeterOfTriangle);                    

                    } else if(select02 == 4){
                        System.out.println("*****Circle*****");
                        System.out.print("Enter the Radius of the Circle: ");
                        radius = sc.nextDouble();
                        perimeterOfCircle = (2 * Math.PI ) * radius;
                        System.out.printf("The Perimeter of the Circle is: %f" , perimeterOfCircle);

                    } else{
                        System.out.println("NOT Valid Action!!!\n");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("*****Area******");
                    System.out.println("Choose Shape:\n [1] Square\n [2] Rectangle\n [3] Triangel\n [4] Circle\n [5] Parallelogram\n [6] Trapezoid");
                    System.out.print("Enter choice: ");
                    select03 = sc.nextInt();
                    clearScreen();
                    if (select03 == 1){
                        System.out.println("*****Square*****");
                        System.out.print("Enter the side of the Square: ");
                        squareside = sc.nextInt();
                        AreaOfSquare = (int) Math.pow(squareside, 2);
                        System.out.printf("The Area og Cirlce is: %d" , AreaOfSquare);
        
                    }else if(select03 == 2){
                        System.out.println("*****Rectangle*****");
                        System.out.print("Enter the Length of the Rectangle: ");
                        recLen = sc.nextInt();
                        System.out.print("Enter the Width of the Rectangle: ");
                        recWid = sc.nextInt();
                        AreaOfREc = recLen * recWid;
                        System.out.printf("The Area of Rectangle is: %f" , AreaOfREc);

                    }else if(select03 == 3){
                        System.out.println("*****Triangle*****");
                        System.out.print("Enter the Base of the Triangle: ");
                        tribase = sc.nextInt();
                        System.out.print("Enter the Height of the Triangle: ");
                        triheight = sc.nextInt();
                        AreaofTri = (1/2)* tribase * triheight;
                        System.out.printf("The Area of Triangle is: %f" , AreaofTri);

                    }else if(select03 == 4){
                        System.out.println("*****Circle*****");
                        System.out.print("Enter the radius of the Circle: ");
                        radius = sc.nextInt();
                        AreaOfCircle = Math.PI * Math.pow(radius, 2);
                        System.out.printf("The Area of Circle is: %f" , AreaOfCircle);

                    }else if(select03 == 5){
                        System.out.println("*****Parallelogram*****");
                        System.out.print("Enter the base of the Parallelogram: ");
                        parrbase = sc.nextInt();
                        System.out.print("Enter the height of the Parallelogram: ");
                        parrheight = sc.nextInt();
                        AreaOfParr = parrbase * parrheight;
                        System.out.printf("The Area of Parallelogram is: %d" , AreaOfParr);

                    } else{
                        System.out.println("NOT Valid Action!!!\n");
                        return;
                    }
                    break;
                case 3:
                    System.out.println("*****Volume******");
                    System.out.println("Choose Object:\n [1] Cube\n [2] Right Rectangular Prism\n [3] Cylinder\n [4] Pyramid \n [5] Sphere");
                    System.out.print("Enter choice: ");
                    select04 = sc.nextInt();
                    clearScreen();
                    if (select04 == 1) {
                        System.out.println("*****Cube*****");
                        System.out.print("Enter the side of the Cube: ");
                        cubeside = sc.nextInt();
                        VolofCube = (int) Math.pow(cubeside, 3);
                        System.out.printf("The Volume of the Cube is: %d" , VolofCube);

                    } else if(select04 == 2) {
                        System.out.println("*****Right Rectangular Prism*****");
                        System.out.print("Enter the Length: ");
                        len = sc.nextInt();
                        System.out.print("Enter the Width: ");
                        wid = sc.nextInt();
                        System.out.print("Enter the Height: ");
                        height = sc.nextInt();
                        VolOfRecPrism = len * wid * height;
                        System.out.printf("The Volume of the Right Rectangular Prism is: %d" , VolOfRecPrism);

                    } else if(select04 == 3) {
                        System.out.println("*****Cylinder*****");
                        System.out.print("Enter the radius : ");
                        radius = sc.nextInt();
                        AreaOfCircle = Math.PI * Math.pow(radius, 2);
                        System.err.print("Enter the height: ");
                        height = sc.nextInt();
                        VolOfCylinder = AreaOfCircle * height;
                        System.out.printf("The Volume of the Cylinder is: %f" , VolOfCylinder);

                    } else if(select04 == 4) {
                        System.out.println("*****Pyramid*****");
                        System.out.print("Enter the Length of the base: ");
                        recLen = sc.nextInt();
                        System.out.print("Enter the Width of the base: ");
                        recWid = sc.nextInt();
                        AreaOfREc = recLen * recWid;
                        System.out.print("Enter the height: ");
                        height = sc.nextInt();
                        VolOfPyramid = AreaOfREc * height;
                        System.out.printf("The Volume of the Pyramid is: %f" , VolOfPyramid);

                    } else if(select04 == 5) {
                        System.out.println("*****Sphere*****");
                        System.out.print("Enter the radius : ");
                        radius = sc.nextInt();
                        VolOfSphere = ((4/3) * Math.PI) * (Math.pow(radius, 3));
                        System.out.printf("The Volume of the Sphere is: %f" , VolOfSphere);
                    }
                    break;
                default:
                    break;
            }
            Scanner loop = new Scanner(System.in);
            System.out.print("\n\nWould you like to try again? (Y/N): ");
            tryloop = loop.next().charAt(0);
            clearScreen();
        }
        while (tryloop == 'Y' || tryloop == 'y');
        
    }
}
