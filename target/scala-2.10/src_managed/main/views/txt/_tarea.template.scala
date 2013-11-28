
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
object _tarea extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template2[String,Boolean,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(tarea: String,realizada: Boolean):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""
	"""),_display_(Seq[Any](/*3.3*/if(tarea != null)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
		"descripcion": """"),_display_(Seq[Any](/*4.20*/tarea)),format.raw/*4.25*/(""""
		"""),_display_(Seq[Any](/*5.4*/if(realizada != null)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
			,"realizada": """),_display_(Seq[Any](/*6.19*/realizada)),format.raw/*6.28*/("""
		""")))})),format.raw/*7.4*/("""
	""")))})),format.raw/*8.3*/("""
"""),format.raw/*9.1*/("""}"""))}
    }
    
    def render(tarea:String,realizada:Boolean): play.api.templates.TxtFormat.Appendable = apply(tarea,realizada)
    
    def f:((String,Boolean) => play.api.templates.TxtFormat.Appendable) = (tarea,realizada) => apply(tarea,realizada)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 23 21:02:36 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/_tarea.scala.txt
                    HASH: f74123ecaf8f875dbdba6b2eef5e9e0647216606
                    MATRIX: 777->1|904->35|932->37|959->38|997->42|1022->59|1061->61|1117->82|1143->87|1183->93|1212->114|1251->116|1306->136|1336->145|1371->150|1405->154|1433->156
                    LINES: 26->1|29->1|30->2|30->2|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|34->6|34->6|35->7|36->8|37->9
                    -- GENERATED --
                */
            