
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateProduct_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class updateProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models._
import helper._

Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*4.1*/("""
    """),format.raw/*5.5*/("""<!-- a 'helper' will be used to create the form dynamically,
though a static HTML form would also work -->
"""),format.raw/*8.1*/("""

"""),format.raw/*10.1*/("""<!-- Pass page title and content """),format.raw/*10.34*/("""{"""),format.raw/*10.35*/("""html between braces"""),format.raw/*10.54*/("""}"""),format.raw/*10.55*/(""" """),format.raw/*10.56*/("""to the main view -->
"""),_display_(/*11.2*/admin/*11.7*/.adminMain("Update product", user)/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
    """),format.raw/*12.5*/("""<h3>Update Product</h3>

        <!-- Use the views.html.helpers package to create the form -->
    """),_display_(/*15.6*/form(action = routes.AdminController.updateProductSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*15.146*/ {_display_(Seq[Any](format.raw/*15.148*/("""

        """),format.raw/*17.9*/("""<!-- Build the form, adding an input for each field -->
        <!-- Note the label parameter -->
        """),_display_(/*19.10*/inputText(updateProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*19.90*/("""
        """),_display_(/*20.10*/inputText(updateProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*20.104*/("""

        """),format.raw/*22.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in form object using catSelect defined in Product  -->
        """),_display_(/*26.10*/for((value, name) <- Category.options) yield /*26.48*/ {_display_(Seq[Any](format.raw/*26.50*/("""
            """),format.raw/*27.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*27.63*/value),format.raw/*27.68*/(""""
            """),_display_(/*28.14*/if(Category.inCategory(value.toLong, id))/*28.55*/ {_display_(Seq[Any](format.raw/*28.57*/("""
                """),format.raw/*29.17*/("""checked
            """)))}),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""/>"""),_display_(/*31.16*/name),format.raw/*31.20*/("""<br>
        """)))}),format.raw/*32.10*/("""

    """),_display_(/*34.6*/inputText(updateProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*34.88*/("""
    """),_display_(/*35.6*/inputText(updateProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*35.88*/("""

        """),format.raw/*37.9*/("""<!-- Image upload input -->
    <label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">

    <br><br>

        <!-- Add a submit button -->
    <div class="actions">
        <input type="submit" value="Save" class="btn btn-primary">
        <a href=""""),_display_(/*46.19*/routes/*46.25*/.AdminController.products(0)),format.raw/*46.53*/(""""
        <button class="btn btn-warning" role="button">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*50.2*/(""" """),format.raw/*50.3*/("""<!-- End Form definition -->

    """)))}),format.raw/*52.6*/(""" """),format.raw/*52.7*/("""<!-- End of page content -->"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user)

  def f:((Long,Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user) => apply(id,updateProductForm,user)

  def ref: this.type = this

}


}

/**/
object updateProduct extends updateProduct_Scope0.updateProduct
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 14:25:13 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/admin/updateProduct.scala.html
                  HASH: ac244fb6d008369281cee592e05b70c68ef7db6e
                  MATRIX: 804->1|1006->77|1034->96|1065->101|1198->225|1227->227|1288->260|1317->261|1364->280|1393->281|1422->282|1470->304|1483->309|1526->343|1566->345|1598->350|1725->451|1875->591|1916->593|1953->603|2087->710|2188->790|2225->800|2341->894|2378->904|2772->1271|2826->1309|2866->1311|2907->1324|2984->1374|3010->1379|3052->1394|3102->1435|3142->1437|3187->1454|3239->1475|3280->1488|3310->1491|3335->1495|3380->1509|3413->1516|3516->1598|3548->1604|3651->1686|3688->1696|3996->1977|4011->1983|4060->2011|4187->2108|4215->2109|4280->2144|4308->2145
                  LINES: 27->1|33->1|35->4|36->5|38->8|40->10|40->10|40->10|40->10|40->10|40->10|41->11|41->11|41->11|41->11|42->12|45->15|45->15|45->15|47->17|49->19|49->19|50->20|50->20|52->22|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|59->29|60->30|61->31|61->31|61->31|62->32|64->34|64->34|65->35|65->35|67->37|76->46|76->46|76->46|80->50|80->50|82->52|82->52
                  -- GENERATED --
              */
          