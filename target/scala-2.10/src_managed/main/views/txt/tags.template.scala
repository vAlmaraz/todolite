
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
object tags extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template1[List[Tag],play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(tags:List[Tag]):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""
[
	"""),_display_(Seq[Any](/*3.3*/for(i <- tags.indices) yield /*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
		"""),_display_(Seq[Any](/*4.4*/_tag(tags(i)))),format.raw/*4.17*/("""
		"""),_display_(Seq[Any](/*5.4*/if(i < tags.size - 1)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
			,
		""")))})),format.raw/*7.4*/("""
	""")))})),format.raw/*8.3*/("""
]"""))}
    }
    
    def render(tags:List[Tag]): play.api.templates.TxtFormat.Appendable = apply(tags)
    
    def f:((List[Tag]) => play.api.templates.TxtFormat.Appendable) = (tags) => apply(tags)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 28 20:34:28 CET 2013
                    SOURCE: C:/play/workspace/tareas/app/views/tags.scala.txt
                    HASH: c0963e5e40213f6c87303def8e1f3b9b62476efc
                    MATRIX: 770->1|879->17|920->24|957->46|996->48|1035->53|1069->66|1108->71|1137->92|1176->94|1217->105|1251->109
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|35->7|36->8
                    -- GENERATED --
                */
            