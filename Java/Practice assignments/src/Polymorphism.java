    class Shapes
    {
        public void sides()
        {
            System.out.println("sides() method.");
        }
    }
    class Square extends Shapes
    {
        public void sides()
        {
            System.out.println("square has four sides.");
        }
    }
    class Triangle extends Shapes
    {
        public void sides()
        {
            System.out.println("triangle has three sides.");
        }
    }
    class PolymorphismExample
    {
        public static void main(String[] args)
        {
            Shapes shape = new Shapes();
            Shapes square = new Square();
            Shapes triangle = new Triangle();
            shape.sides();
            square.sides();
            triangle.sides();
        }
    }


