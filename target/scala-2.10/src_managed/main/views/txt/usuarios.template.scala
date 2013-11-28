
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
object usuarios extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[List[Usuario],play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuarios:List[Usuario]):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""
[
	"""),_display_(Seq[Any](/*3.3*/for(i <- usuarios.indices) yield /*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
		"""),_display_(Seq[Any](/*4.4*/_usuario(usuarios(i)))),format.raw/*4.25*/("""
		"""),_display_(Seq[Any](/*5.4*/if(i < usuarios.size - 1)/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
			,
		""")))})),format.raw/*7.4*/("""
	""")))})),format.raw/*8.3*/("""
]"""))}
    }
    
    def render(usuarios:List[Usuario]): play.api.templates.TxtFormat.Appendable = apply(usuarios)
    
    def f:((List[Usuario]) => play.api.templates.TxtFormat.Appendable) = (usuarios) => apply(usuarios)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 28 20:27:42 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/usuarios.scala.txt
                    HASH: 34cd8275e368be85047220ced67bde90ed0ec947
                    MATRIX: 778->1|895->25|936->32|977->58|1016->60|1055->65|1097->86|1136->91|1169->116|1208->118|1249->129|1283->133
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|35->7|36->8
                    -- GENERATED --
                */
            