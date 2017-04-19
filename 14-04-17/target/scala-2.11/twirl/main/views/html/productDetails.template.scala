
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object productDetails_Scope0 {
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

     object productDetails_Scope1 {
import helper._

class productDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template11[List[models.Category],models.users.User,Long,Long,String,Long,models.Product,List[models.productsAdditions.Comment],List[models.Size],Form[productsAdditions.Comment],models.Size,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(categories: List[models.Category], user: models.users.User, id: Long, catId: Long, filter: String, sId: Long, prod: models.Product, cList: List[models.productsAdditions.Comment], sList: List[models.Size], commentForm: Form[productsAdditions.Comment], size: models.Size):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.272*/("""
"""),_display_(/*3.2*/main("productDetails", user,  categories, catId, filter)/*3.58*/ {_display_(Seq[Any](format.raw/*3.60*/("""
				"""),format.raw/*4.5*/("""<div class="col-sm-12 padding-right">
					<div class="product-details"><!--product-details-->
						<div class="col-sm-5">
							<div class="view-product">
								<img src="/assets/images/productImages/"""),_display_(/*8.49*/(prod.getId)),format.raw/*8.61*/(""".jpg" alt="" />
								
							</div>
							<div id="similar-product" class="carousel slide" data-ride="carousel">
								
								  

								  <!-- Controls -->
								  <a class="left item-control" href="#similar-product" data-slide="prev">
									<i class="fa fa-angle-left"></i>
								  </a>
								  <a class="right item-control" href="#similar-product" data-slide="next">
									<i class="fa fa-angle-right"></i>
								  </a>
							</div>
							

						</div>
						<div class="col-sm-7">
							<div class="product-information"><!--/product-information-->
								
								<h2>"""),_display_(/*29.14*/prod/*29.18*/.getName),format.raw/*29.26*/("""</h2>
								
								
								<span>
									<span>€"""),_display_(/*33.18*/prod/*33.22*/.getPrice),format.raw/*33.31*/("""</span>
									
									<button type="button" class="btn btn-fefault cart">
										<a href=""""),_display_(/*36.21*/routes/*36.27*/.ShoppingCtrl.addToBasket(id, catId, filter, sId)),format.raw/*36.76*/("""" ><i class="fa fa-shopping-cart"></i>Add to cart</a>
									</button>
								</span>
								

						<div class="form-group col-sm-8">
							<label for="usr">Size:</label>
							<select class="form-control" id="sel1">

   							"""),_display_(/*45.12*/for(s <- sList) yield /*45.27*/ {_display_(Seq[Any](format.raw/*45.29*/("""
								"""),format.raw/*46.9*/("""<option>"""),_display_(/*46.18*/size/*46.22*/.getSizeName()),format.raw/*46.36*/("""</option>   
        							""")))}),format.raw/*47.17*/("""
 						"""),format.raw/*48.8*/("""</select>
						
			
								<p><b>Availability:</b> In Stock</p>
								<p><b>Condition:</b> New</p>
								<p><b>Brand:</b> A&JS</p>
							</div>
								
							</div><!--/product-information-->
						</div>
					</div><!--/product-details-->

						<div class="tab-pane fade active in" id="reviews" >
							<div class="col-sm-12">
								"""),_display_(/*62.10*/for(c <- cList) yield /*62.25*/ {_display_(Seq[Any](format.raw/*62.27*/("""
									"""),format.raw/*63.10*/("""<div class="product-information">
									<ul>
										<li><a href=""><i class="fa fa-user"></i>"""),_display_(/*65.53*/user/*65.57*/.getfName()),format.raw/*65.68*/("""</a></li>
										<li><a href=""><i class="fa fa-clock-o"></i>12:41 PM</a></li>
										<li><a href=""><i class="fa fa-calendar-o"></i>31 DEC 2014</a></li>
									</ul>
									<p> """),_display_(/*69.15*/c/*69.16*/.getContent),format.raw/*69.27*/("""</p>
									</div>
								""")))}),format.raw/*71.10*/("""
								"""),format.raw/*72.9*/("""<p><b>Write Your Review</b></p>



									"""),_display_(/*76.11*/form(action = routes.CustomerCtrl.comment(catId, filter, prod.getId()), 'class -> "form-horizontal", 'role -> "form")/*76.128*/ {_display_(Seq[Any](format.raw/*76.130*/("""
									"""),_display_(/*77.11*/inputText(commentForm("content"), '_label -> "Write your comment here", 'class -> "form-control")),format.raw/*77.108*/("""
										"""),format.raw/*78.11*/("""<input type="submit" value="Add comment" class="btn btn-default pull-right">
									""")))}),format.raw/*79.11*/("""


							"""),format.raw/*82.8*/("""</div>
						</div>
					
					
				</div>
""")))}),format.raw/*87.2*/("""
"""))
      }
    }
  }

  def render(categories:List[models.Category],user:models.users.User,id:Long,catId:Long,filter:String,sId:Long,prod:models.Product,cList:List[models.productsAdditions.Comment],sList:List[models.Size],commentForm:Form[productsAdditions.Comment],size:models.Size): play.twirl.api.HtmlFormat.Appendable = apply(categories,user,id,catId,filter,sId,prod,cList,sList,commentForm,size)

  def f:((List[models.Category],models.users.User,Long,Long,String,Long,models.Product,List[models.productsAdditions.Comment],List[models.Size],Form[productsAdditions.Comment],models.Size) => play.twirl.api.HtmlFormat.Appendable) = (categories,user,id,catId,filter,sId,prod,cList,sList,commentForm,size) => apply(categories,user,id,catId,filter,sId,prod,cList,sList,commentForm,size)

  def ref: this.type = this

}


}
}

/**/
object productDetails extends productDetails_Scope0.productDetails_Scope1.productDetails
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 20:52:37 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/productDetails.scala.html
                  HASH: 47f3dddfa60c2872d8cecb1b48aa67d96cdc6a62
                  MATRIX: 988->18|1354->288|1381->290|1445->346|1484->348|1515->353|1747->559|1779->571|2407->1172|2420->1176|2449->1184|2532->1240|2545->1244|2575->1253|2701->1352|2716->1358|2786->1407|3049->1643|3080->1658|3120->1660|3156->1669|3192->1678|3205->1682|3240->1696|3300->1725|3335->1733|3710->2081|3741->2096|3781->2098|3819->2108|3946->2208|3959->2212|3991->2223|4207->2412|4217->2413|4249->2424|4310->2454|4346->2463|4418->2508|4545->2625|4586->2627|4624->2638|4743->2735|4782->2746|4900->2833|4937->2843|5011->2887
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|41->8|41->8|62->29|62->29|62->29|66->33|66->33|66->33|69->36|69->36|69->36|78->45|78->45|78->45|79->46|79->46|79->46|79->46|80->47|81->48|95->62|95->62|95->62|96->63|98->65|98->65|98->65|102->69|102->69|102->69|104->71|105->72|109->76|109->76|109->76|110->77|110->77|111->78|112->79|115->82|120->87
                  -- GENERATED --
              */
          