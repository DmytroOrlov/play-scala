package controllers

import controllers.HomeControllerSpec.testIndexPage
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.test.FakeRequest
import play.api.test.Helpers.{GET, route, _}

class ApplicationSpec extends PlaySpec with GuiceOneAppPerSuite {
  "Application" should {
    "render the index page" in {
      val res = route(app, FakeRequest(GET, "/")).get

      testIndexPage(res)
    }
  }
}
