/**
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor;

import polytech.spaceteam.cineditor.CinEditorStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class CinEditorStandaloneSetup extends CinEditorStandaloneSetupGenerated {
  public static void doSetup() {
    new CinEditorStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
