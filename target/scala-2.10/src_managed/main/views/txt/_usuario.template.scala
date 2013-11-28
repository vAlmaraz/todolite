
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
object _usuario extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(nombre: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""
	"""),_display_(Seq[Any](/*3.3*/if(nombre != null)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
		"nombre": """"),_display_(Seq[Any](/*4.15*/nombre)),format.raw/*4.21*/(""""
	""")))})),format.raw/*5.3*/("""
"""),format.raw/*6.1*/("""}"""))}
    }
    
    def render(nombre:String): play.api.templates.TxtFormat.Appendable = apply(nombre)
    
    def f:((String) => play.api.templates.TxtFormat.Appendable) = (nombre) => apply(nombre)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 23 21:02:36 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/_usuario.scala.txt
                    HASH: 9a97e5d3e5843e34b8c917d9c837bf69dca6ddff
                    MATRIX: 771->1|880->17|908->19|935->20|973->24|999->42|1038->44|1089->60|1116->66|1151->71|1179->73
                    LINES: 26->1|29->1|30->2|30->2|31->3|31->3|31->3|32->4|32->4|33->5|34->6
                    -- GENERATED --
                */
            