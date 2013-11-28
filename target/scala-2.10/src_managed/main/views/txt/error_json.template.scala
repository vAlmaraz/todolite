
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
object error_json extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template2[Integer,String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(code: Integer,message: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""
	"""),_display_(Seq[Any](/*3.3*/if(message != null)/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
		"message": """"),_display_(Seq[Any](/*4.16*/message)),format.raw/*4.23*/("""",
		"code": """),_display_(Seq[Any](/*5.12*/code)),format.raw/*5.16*/("""
	""")))})),format.raw/*6.3*/("""
"""),format.raw/*7.1*/("""}"""))}
    }
    
    def render(code:Integer,message:String): play.api.templates.TxtFormat.Appendable = apply(code,message)
    
    def f:((Integer,String) => play.api.templates.TxtFormat.Appendable) = (code,message) => apply(code,message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 23 21:02:36 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/error_json.scala.txt
                    HASH: 6171c468457251f7eacf6ee38764951ae2bab4b1
                    MATRIX: 781->1|905->32|933->34|960->35|998->39|1025->58|1064->60|1116->77|1144->84|1194->99|1219->103|1253->107|1281->109
                    LINES: 26->1|29->1|30->2|30->2|31->3|31->3|31->3|32->4|32->4|33->5|33->5|34->6|35->7
                    -- GENERATED --
                */
            