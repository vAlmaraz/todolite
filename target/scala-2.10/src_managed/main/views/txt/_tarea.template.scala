
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
object _tarea extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[Tarea,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(tarea: Tarea):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""
	"""),_display_(Seq[Any](/*3.3*/if(tarea != null)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
		"id":""""),_display_(Seq[Any](/*4.10*/tarea/*4.15*/.id)),format.raw/*4.18*/("""",
		"descripcion": """"),_display_(Seq[Any](/*5.20*/tarea/*5.25*/.descripcion)),format.raw/*5.37*/("""",
		"realizada":""""),_display_(Seq[Any](/*6.17*/tarea/*6.22*/.realizada)),format.raw/*6.32*/(""""
	""")))})),format.raw/*7.3*/("""
"""),format.raw/*8.1*/("""}"""))}
    }
    
    def render(tarea:Tarea): play.api.templates.TxtFormat.Appendable = apply(tarea)
    
    def f:((Tarea) => play.api.templates.TxtFormat.Appendable) = (tarea) => apply(tarea)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 28 20:31:44 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/_tarea.scala.txt
                    HASH: 43c580125014e757321284457dc890f8efa01892
                    MATRIX: 768->1|875->15|903->17|930->18|968->22|993->39|1032->41|1078->52|1091->57|1115->60|1173->83|1186->88|1219->100|1274->120|1287->125|1318->135|1353->140|1381->142
                    LINES: 26->1|29->1|30->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|36->8
                    -- GENERATED --
                */
            