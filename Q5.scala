object Q5 extends App {
    def easyPace(x:Int) : Int = x*8;
    def tempo(y:Int) : Int = y*7;
    print("The total running time : " + (easyPace(2)+ tempo(3) +easyPace(2)) + "min")
}