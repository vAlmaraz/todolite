
package views.txt

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.txt._
/**/
object _tag extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(tag: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.15*/("""
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""
	"""),_display_(Seq[Any](/*3.3*/if(tag != null)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
		"tag": """"),_display_(Seq[Any](/*4.12*/tag)),format.raw/*4.15*/(""""
	""")))})),format.raw/*5.3*/("""
"""),format.raw/*6.1*/("""}"""))}
    }
    
    def render(tag:String): play.api.templates.TxtFormat.Appendable = apply(tag)
    
    def f:((String) => play.api.templates.TxtFormat.Appendable) = (tag) => apply(tag)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 26 18:56:25 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/_tag.scala.txt
                    HASH: a003a5e27b46e88c41c1d54b3fc0eab99d3310ed
                    MATRIX: 767->1|873->14|901->16|928->17|966->21|989->36|1028->38|1076->51|1100->54|1135->59|1163->61
                    LINES: 26->1|29->1|30->2|30->2|31->3|31->3|31->3|32->4|32->4|33->5|34->6
                    -- GENERATED --
                */
            