
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import models._
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[play.data.Form[models.Product],models.users.User,Form[models.Size],Form[models.Size],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(addProductForm: play.data.Form[models.Product], user: models.users.User, size: Form[models.Size], size2: Form[models.Size]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.126*/("""


"""),format.raw/*8.102*/("""

"""),_display_(/*10.2*/admin/*10.7*/.adminMain("Add Product", user)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
	"""),format.raw/*11.2*/("""<h3>Add a new Product</h3>
	
						

	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*16.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*16.138*/ {_display_(Seq[Any](format.raw/*16.140*/("""
		





		"""),format.raw/*23.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*25.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*25.81*/("""
		"""),_display_(/*26.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*26.95*/("""

        """),format.raw/*28.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        """),_display_(/*30.10*/for((value, name) <- Category.options) yield /*30.48*/ {_display_(Seq[Any](format.raw/*30.50*/("""
            """),format.raw/*31.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*31.63*/value),format.raw/*31.68*/("""" />"""),_display_(/*31.73*/name),format.raw/*31.77*/("""<br>        
        """)))}),format.raw/*32.10*/("""

		"""),_display_(/*34.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*34.83*/("""
		"""),_display_(/*35.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*35.83*/("""
		"""),_display_(/*36.4*/inputText(size("sizeName"), '_label -> "Size",'class -> "form-control")),format.raw/*36.75*/("""
		"""),_display_(/*37.4*/inputText(size2("sizeName"), '_label -> "Size2",'class -> "form-control")),format.raw/*37.77*/("""
		
		
		

		"""),format.raw/*42.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*51.14*/routes/*51.20*/.AdminController.products(0)),format.raw/*51.48*/(""""
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*55.3*/(""" """),format.raw/*55.4*/("""<!-- End Form definition -->

""")))}),format.raw/*57.2*/(""" """),format.raw/*57.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.User,size:Form[models.Size],size2:Form[models.Size]): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user,size,size2)

  def f:((play.data.Form[models.Product],models.users.User,Form[models.Size],Form[models.Size]) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user,size,size2) => apply(addProductForm,user,size,size2)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 12:39:07 IST 2017
                  SOURCE: /home/wdd/Desktop/13-04-17/integrated-11-04-17/app/views/admin/addProduct.scala.html
                  HASH: 05657ddd4042bcc5424675560b81653a83c4d1db
                  MATRIX: 904->37|1124->161|1155->265|1184->268|1197->273|1237->304|1277->306|1306->308|1435->411|1580->546|1621->548|1659->559|1780->654|1878->731|1908->735|2020->826|2057->836|2252->1004|2306->1042|2346->1044|2387->1057|2464->1107|2490->1112|2522->1117|2547->1121|2600->1143|2631->1148|2731->1227|2761->1231|2861->1310|2891->1314|2983->1385|3013->1389|3107->1462|3147->1475|3443->1744|3458->1750|3507->1778|3610->1851|3638->1852|3699->1883|3727->1884
                  LINES: 31->5|36->5|39->8|41->10|41->10|41->10|41->10|42->11|47->16|47->16|47->16|54->23|56->25|56->25|57->26|57->26|59->28|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|63->32|65->34|65->34|66->35|66->35|67->36|67->36|68->37|68->37|73->42|82->51|82->51|82->51|86->55|86->55|88->57|88->57
                  -- GENERATED --
              */
          