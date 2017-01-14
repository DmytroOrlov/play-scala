import controllers.HomeController
import org.scalatestplus.play._
import play.api.test.Helpers._
import play.api.test._

class ApplicationSpec extends PlaySpec {
  "HomeController" should {
    "render the index page" in {
      val controller = new HomeController
      val res = controller.index(FakeRequest(GET, "/"))

      status(res) mustBe OK
      contentType(res) mustBe Some("text/plain")
      contentAsString(res) mustBe "1"
    }
  }
}
