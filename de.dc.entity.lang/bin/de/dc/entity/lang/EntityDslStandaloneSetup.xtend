/*
 * generated by Xtext 2.17.0
 */
package de.dc.entity.lang


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EntityDslStandaloneSetup extends EntityDslStandaloneSetupGenerated {

	def static void doSetup() {
		new EntityDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
