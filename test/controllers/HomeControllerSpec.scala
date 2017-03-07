package controllers

import controllers.HomeControllerSpec.testIndexPage
import org.scalatest.MustMatchers
import org.scalatestplus.play._
import play.api.mvc.{DefaultActionBuilder, DefaultControllerComponents, Result}
import play.api.test.Helpers._
import play.api.test._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class HomeControllerSpec extends PlaySpec {
  private val components = DefaultControllerComponents(DefaultActionBuilder(null), null, null, null, null, null)

  "HomeController" should {
    "render the index page" in {
      val controller = new HomeController(components)
      val res = controller.index(FakeRequest(GET, "/"))

      testIndexPage(res)
    }
  }
}

object HomeControllerSpec extends MustMatchers {
  def testIndexPage(res: Future[Result]): Unit = {
    status(res) mustBe OK
    contentType(res) mustBe Some("text/plain")
    contentAsString(res) mustBe "1"
  }
}
