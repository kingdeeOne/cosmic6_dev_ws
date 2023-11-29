package qyrv.psi.psi.plugin.form;

import kd.bos.dataentity.entity.LocaleString;
import kd.bos.form.FormShowParameter;
import kd.bos.form.events.PreOpenFormEventArgs;
import kd.bos.form.plugin.AbstractFormPlugin;

import java.util.EventObject;

public class TestFormPlugin extends AbstractFormPlugin {
    @Override
    public void preOpenForm(PreOpenFormEventArgs e) {
        super.preOpenForm(e);

        System.out.println("代码执行到了插件中");
        FormShowParameter formShowParameter = e.getFormShowParameter();
        formShowParameter.setCaption("插件设置的标题");
    }
}
