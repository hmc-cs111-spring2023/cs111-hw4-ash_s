import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class CollatzSpec extends AnyFunSuite with Matchers:

    test("collatz with 6"){
        collatz(6) should be (3)
    }

    test("collatz with 7"){
        collatz(7) should be (22)
    }

    test("collatz with 1"){
        collatz(1) should be (4)
    }

    test("collatz with 2"){
        collatz(2) should be (1)
    }

    test("collatz with 42"){
        collatz(42) should be (21)
    }

    test("collatz with 101"){
        collatz(101) should be (304)
    }

    test("collatzCount with 1"){
        collatzCount(1) should be (0)
    }

    test("collatzCount with 101"){
        collatzCount(101) should be (25)
    }

    test("collatzCount with 1111"){
        collatzCount(1111) should be (31)
    }

    test("collatzCount with 267"){
        collatzCount(267) should be (21)
    }

end CollatzSpec
