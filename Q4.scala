object Q4 extends App {
    def cost(x: Int) : Double = {
        var coverPrice: Double = x*24.95;
        var discount : Double = coverPrice*40/100;
        var shipCost : Double = if(x>50){50*3 + 0.75*(x - 50)} else x * 3;
        var totalCost: Double = coverPrice - discount + shipCost;
        return totalCost;
    }

    print(cost(60));
}