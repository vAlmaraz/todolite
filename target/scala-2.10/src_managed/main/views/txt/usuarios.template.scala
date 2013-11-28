
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
object usuarios extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[List[String],play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuarios:List[String]):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.25*/("""
[
	"""),_display_(Seq[Any](/*3.3*/for(i <- usuarios.indices) yield /*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
		"""),_display_(Seq[Any](/*4.4*/_usuario(usuarios(i)))),format.raw/*4.25*/("""
		"""),_display_(Seq[Any](/*5.4*/if(i < usuarios.size - 1)/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
			,
		""")))})),format.raw/*7.4*/("""
	""")))})),format.raw/*8.3*/("""
]"""))}
    }
    
    def render(usuarios:List[String]): play.api.templates.TxtFormat.Appendable = apply(usuarios)
    
    def f:((List[String]) => play.api.templates.TxtFormat.Appendable) = (usuarios) => apply(usuarios)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 24 16:55:58 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/usuarios.scala.txt
                    HASH: 77e45a40c3128f920f8d33a995a3a102b7869de6
                    MATRIX: 777->1|893->24|934->31|975->57|1014->59|1053->64|1095->85|1134->90|1167->115|1206->117|1247->128|1281->132
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|35->7|36->8
                    -- GENERATED --
                */
            