package controllers

import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.mvc.ControllerComponents
import uk.gov.hmrc.play.test.UnitSpec
import play.api.test.FakeRequest
import play.api.http.Status

class ApplicationControllerSpec extends UnitSpec with GuiceOneAppPerSuite {

  val controllerComponents: ControllerComponents = app.injector.instanceOf[ControllerComponents]

  object TestApplicationController extends ApplicationController(
    controllerComponents
  )

  "ApplicationController .index()" should {

    val result = TestApplicationController.index()(FakeRequest())

    "return OK" in {
      status(result) shouldBe Status.OK
    }
  }

  "ApplicationController .create(id: String)" should {

  }

  "ApplicationController .read(id: String)" should {

  }

  "ApplicationController .update(id: String)" should {

  }

  "ApplicationController .delete()" should {

  }
}
