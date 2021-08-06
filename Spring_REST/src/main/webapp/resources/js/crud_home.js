/**
 * 
 */
const updateBtn = document.getElementById('update');
const display = document.getElementById('display');

updateBtn.addEventListener('click', () => {
	const xhttp = new XMLHttpRequest;

	xhttp.addEventListener('readystatechange', (e) => {
		const target = e.target;
		const status = target.status;
		const readyState = target.readyState;
		const name = document.getElementById('cname').value;
		const price = document.getElementById('price').value;
		const group_id = document.getElementById('group_id').value;
		
		console.log(name);
		console.log(price);
		console.log(group_id);
		
		if (status == 200 && readyState == 4) {
			const new_node = document.createElement('tr');
			const new_node2 = document.createElement('button');
			new_node2.innerHTML = '삭제';
			new_node.innerHTML = target.responseText + new_node2;
			console.log(new_node);
			display.appendChild(new_node);
		}
	});

	xhttp.open('GET', '/rest/sample/menus/insert', true);
	xhttp.send();
});