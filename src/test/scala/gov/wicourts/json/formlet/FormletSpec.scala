package gov.wicourts.json.formlet

//import Predef.ArrowAssoc
import cats.Id
import cats.Monoid
import cats.data.Validated
import cats.syntax.all._
//import org.scalacheck.Gen
//import org.scalacheck.Arbitrary
import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

//import gov.wicourts.json.formlet.test.instances._

class FormletSpec extends Specification with ScalaCheck {
  "Formlet" >> {

    "Constructors" >> {

      "pure" >> {
        "value must be equal" >> prop((a: Int) =>
          Formlet.pure[Id, Validated, Int, String, Int, Int](a).run(99)._1 === a.valid,
        )

        "view must be empty" >> prop((a: Int) =>
          Formlet.pure[Id, Validated, Int, String, Int, Int](a).run(99)._2 === Monoid[String].empty,
        )
      }

    }
  }
}
