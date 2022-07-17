object Q3 extends App {
    def vol(r: Int) : Double = {
        return math.Pi*r*r*r*4/3;
    }

    print("The volume of a sphere : "+vol(5));
}