package generator.view.views;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.part.ViewPart;

import generator.model.ModelFactoryModel;



/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class GeneratorView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "generator.view.views.GeneratorView";

	public GeneratorView() {}
	private Button btnGenerateM2T;

	 

	
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(null);
		
		Group grpGeneracinDeModelo2M = new Group(parent, SWT.NONE);
		grpGeneracinDeModelo2M.setText("Generaci\u00F3n de modelo a modelo");
		grpGeneracinDeModelo2M.setBounds(10, 10, 562, 74);
		
		
		Button btnGenerateM2M = new Button(grpGeneracinDeModelo2M, SWT.NONE);
		
		btnGenerateM2M.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = new ModelFactoryModel();
				mfm.generarModelToModel();
			}
		});
		btnGenerateM2M.setBounds(116, 23, 334, 38);
		btnGenerateM2M.setText("Generate M2M");
		
		Group grpGeneracinDeModelo2T = new Group(parent, SWT.NONE);
		grpGeneracinDeModelo2T.setText("Generaci\u00F3n de modelo a texto");
		grpGeneracinDeModelo2T.setBounds(10, 90, 562, 74);
		
		btnGenerateM2T = new Button(grpGeneracinDeModelo2T, SWT.NONE);
		btnGenerateM2T.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = new ModelFactoryModel();
				mfm.generarModelToText();
			}
		});
		btnGenerateM2T.setText("Generate M2T");
		btnGenerateM2T.setBounds(116, 26, 334, 38);
		
		Group grpLimpiarProduccin = new Group(parent, SWT.NONE);
		grpLimpiarProduccin.setText("Limpiar producci\u00F3n");
		grpLimpiarProduccin.setBounds(10, 175, 562, 74);
		
		Button btnLimpiar = new Button(grpLimpiarProduccin, SWT.NONE);
		btnLimpiar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = new ModelFactoryModel();
				mfm.limpiarProduccion();
			}
		});
		btnLimpiar.setText("Limpiar todo");
		btnLimpiar.setBounds(115, 22, 334, 38);
		
		
		
		Group grpGeneracinDeModelo2M2 = new Group(parent, SWT.NONE);
		grpGeneracinDeModelo2M2.setText("Generaci\u00F3n de modelo a modelo SQL");
		grpGeneracinDeModelo2M2.setBounds(600, 10, 562, 74);
		
		Button btnM2MSQL = new Button(grpGeneracinDeModelo2M2, SWT.NONE);
		btnM2MSQL.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = new ModelFactoryModel();
				mfm.generarModelToModelSQL();
			}
		});
		btnM2MSQL.setText("Generar modelo relacional");
		btnM2MSQL.setBounds(115, 22, 334, 38);
		
		
		Group grpGeneracinDeModelo2T2 = new Group(parent, SWT.NONE);
		grpGeneracinDeModelo2T2.setText("Generaci\u00F3n de modelo a texto SQL");
		grpGeneracinDeModelo2T2.setBounds(600, 90, 562, 74); 
		Button btnM2TSQL = new Button(grpGeneracinDeModelo2T2, SWT.NONE);
		btnM2TSQL.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = new ModelFactoryModel();
				mfm.generarModelToTextSQL();
			}
		});
		btnM2TSQL.setText("Generar DDL");
		btnM2TSQL.setBounds(115, 22, 334, 38);
		
		Group grpGeneracinAll = new Group(parent, SWT.NONE);
		grpGeneracinAll.setText("Limpiar");
		grpGeneracinAll.setBounds(600, 175, 562, 74); 
		Button btnAll = new Button(grpGeneracinAll, SWT.NONE);
		btnAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = new ModelFactoryModel();
				mfm.limpiarProduccion();
				mfm.generarModelToModel();
				mfm.generarModelToModelSQL();
				mfm.generarModelToTextSQL();
			}
		});
		btnAll.setText("Limpiar y generar todo");
		btnAll.setBounds(115, 22, 334, 38);
	}

	@Override
	public void setFocus() {
	
	}
}
