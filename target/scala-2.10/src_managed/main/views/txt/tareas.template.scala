
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
object tareas extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[List[Tarea],play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(tareas:List[Tarea]):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.22*/("""
[
	"""),_display_(Seq[Any](/*3.3*/for(i <- tareas.indices) yield /*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
		"""),_display_(Seq[Any](/*4.4*/_tarea(tareas(i)))),format.raw/*4.21*/("""
		"""),_display_(Seq[Any](/*5.4*/if(i < tareas.size - 1)/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
			,
		""")))})),format.raw/*7.4*/("""
	""")))})),format.raw/*8.3*/("""
]"""))}
    }
    
    def render(tareas:List[Tarea]): play.api.templates.TxtFormat.Appendable = apply(tareas)
    
    def f:((List[Tarea]) => play.api.templates.TxtFormat.Appendable) = (tareas) => apply(tareas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 28 20:31:44 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/tareas.scala.txt
                    HASH: 752897757c0a46bb19c51d29fc302fd6cdd517b0
                    MATRIX: 774->1|887->21|928->28|967->52|1006->54|1045->59|1083->76|1122->81|1153->104|1192->106|1233->117|1267->121
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|35->7|36->8
                    -- GENERATED --
                */
            