
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
object tareas extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template2[List[String],List[Boolean],play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(descripciones:List[String],realizadas:List[Boolean]):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.55*/("""
[
	"""),_display_(Seq[Any](/*3.3*/for(i <- descripciones.indices) yield /*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
		"""),_display_(Seq[Any](/*4.4*/_tarea(descripciones(i),realizadas(i)))),format.raw/*4.42*/("""
		"""),_display_(Seq[Any](/*5.4*/if(i < descripciones.size - 1)/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
			,
		""")))})),format.raw/*7.4*/("""
	""")))})),format.raw/*8.3*/("""
]"""))}
    }
    
    def render(descripciones:List[String],realizadas:List[Boolean]): play.api.templates.TxtFormat.Appendable = apply(descripciones,realizadas)
    
    def f:((List[String],List[Boolean]) => play.api.templates.TxtFormat.Appendable) = (descripciones,realizadas) => apply(descripciones,realizadas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 24 16:55:36 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/tareas.scala.txt
                    HASH: e9c4c999354d72b9889394d94ef916d9f1f4cac4
                    MATRIX: 789->1|935->54|976->61|1022->92|1061->94|1100->99|1159->137|1198->142|1236->172|1275->174|1316->185|1350->189
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|35->7|36->8
                    -- GENERATED --
                */
            