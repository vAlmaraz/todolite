
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
object _usuario extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[Usuario,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: Usuario):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""
	"""),_display_(Seq[Any](/*3.3*/if(user != null)/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
		"id":""""),_display_(Seq[Any](/*4.10*/user/*4.14*/.id)),format.raw/*4.17*/("""",
		"nombre": """"),_display_(Seq[Any](/*5.15*/user/*5.19*/.nombre)),format.raw/*5.26*/(""""
	""")))})),format.raw/*6.3*/("""
"""),format.raw/*7.1*/("""}"""))}
    }
    
    def render(user:Usuario): play.api.templates.TxtFormat.Appendable = apply(user)
    
    def f:((Usuario) => play.api.templates.TxtFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 28 20:27:42 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/_usuario.scala.txt
                    HASH: 3a03916e36dd421d658be5dc1ec7945cf81c79ee
                    MATRIX: 772->1|880->16|908->18|935->19|973->23|997->39|1036->41|1082->52|1094->56|1118->59|1171->77|1183->81|1211->88|1246->93|1274->95
                    LINES: 26->1|29->1|30->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|35->7
                    -- GENERATED --
                */
            