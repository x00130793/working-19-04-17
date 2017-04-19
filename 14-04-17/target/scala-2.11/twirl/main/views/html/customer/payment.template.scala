
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object payment_Scope0 {
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

class payment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.124*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Payment", user, categories, catId, filter)/*6.50*/  {_display_(Seq[Any](format.raw/*6.53*/("""


	"""),format.raw/*9.2*/("""<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				<h2 class="title text-center">Payment</h2>
				<div id="accordian">
					<div class="col-sm-8 col-sm-offset-1">

					
						<div class="form-group col-sm-8">
							<label for="usr">Card Number:</label>
							<input type="text" class="form-control" id="usr">
						</div>
					

				
						<div class="form-group col-sm-8">
							<label for="usr">Expiration Date:</label>
							<select class="form-control" id="sel1">
   							<option>1</option>
   							<option>2</option>
   							<option>3</option>
  							<option>4</option>
   							<option>5</option>
   							<option>6</option>
   							<option>7</option>
  							<option>8</option>
   							<option>9</option>
   							<option>10</option>
   							<option>11</option>
  							<option>12</option>
 						</select>
						</div>

						<div class="form-group col-sm-8">
						<select class="form-control " id="sel1">
   							<option>2017</option>
   							<option>2018</option>
   							<option>2019</option>
  							<option>2020</option>
   							<option>2021</option>
   							
 						</select>
						</div>
						
					
						<div class="form-group col-sm-8">
							<label for="usr">First Name:</label>
							<input type="text" class="form-control" id="usr">
						</div>
								
						<div class="form-group col-sm-8">
							<label for="usr">Last Name:</label>
							<input type="text" class="form-control" id="usr">
						</div>

						<div class="form-group col-sm-8">
							<label for="usr">Security Code:</label>
							<input type="text" class="form-control" id="usr">
						</div>

						


						<div class="form-group col-sm-8">
							<label for="usr">Street1:</label>
							<input type="text" class="form-control" id="usr">
							
						</div>

						

						<div class="form-group col-sm-8">
							<label for="usr">Street2:</label>
							<input type="text" class="form-control" id="usr">
						</div>

						<div class="form-group col-sm-8">
							<label for="usr">Town:</label>
							<input type="text" class="form-control" id="usr">
						</div>
						
					<div class="form-group col-sm-8">
						<p class="text-left">
                    				<a href=""""),_display_(/*92.35*/routes/*92.41*/.ShoppingCtrl.placeOrder()),format.raw/*92.67*/("""" class="btn btn-success btn-sm">
                    				<span class="glyphicon glyphicon-euro"></span> Place Order</a>
               					</p>
					</div>	


					</div>
				</div>

			</div>

			</div>








		</div>


""")))}),format.raw/*115.2*/("""
"""),format.raw/*116.1*/("""<!-- Create file payment, change routes -->
"""))
      }
    }
  }

  def render(Customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(Customer,user,categories,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (Customer,user,categories,catId,filter) => apply(Customer,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object payment extends payment_Scope0.payment
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 14:25:12 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/customer/payment.scala.html
                  HASH: f478478e4f8cf7a82f46a6d2f5432ddac7d508d8
                  MATRIX: 825->1|1058->123|1086->142|1114->145|1170->193|1210->196|1240->200|3516->2449|3531->2455|3578->2481|3835->2707|3864->2708
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|39->9|122->92|122->92|122->92|145->115|146->116
                  -- GENERATED --
              */
          