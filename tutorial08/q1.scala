package tutorial08

object q1 extends App{

    var a = Point(1,3);
    var b = Point(5,6);

    println(a);
    println(b);

    println(a.add(b));

    a.move(2, 3);
    println(a);

    var c = a.distance(b)
    println(c);

    a.invert()
    println(a)

  }


  case class Point(var x:Int, var y:Int) {  // primary constructor is the class signature
    def add(p:Point) = new Point(x+p.x, y+p.y)

    def move(n:Int, m:Int) ={
      this.x = this.x + n;
      this.y = this.y + m;
    }

    def distance(a:Point) = {
      var xDist = x - a.x;
      var yDist = y - a.y;
      var dist = xDist*xDist + yDist*yDist;   // b = root(a^2+b^2)
      scala.math.sqrt(dist)
    }

    def invert() = {
      var tmp = this.x;
      this.x = this.y;
      this.y = tmp;
    }
}
