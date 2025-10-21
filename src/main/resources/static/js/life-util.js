function gettersId(name) {
	stringValid(name);
	return document.getElementById(name);
}

function gettersClass(name, index = 0) {
	stringValid(name);
	return document.getElementsByClassName(name)[index];
}

function gettersClassAll(name) {
	stringValid(name);
	return document.getElementsByClassName(name);
}

function stringValid(name) {
	if(!name) throw new Error(`parameter Type Only String => ${name}`);
}

function htmlValid(tag) {
	if(!tag instanceof HTMLElement) throw new TypeError(`parameter Type Only HTMLElement => ${tag}`);
}