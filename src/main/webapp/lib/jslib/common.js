
/**
 * ���ƶ�ά�� div��id-����-��-��
 */
function drawQrCode(id,content,width,height){
		var qrcode = new QRCode(id,{
			width:width,
			height:height,
			colorDark:'#000000',
			colorLight:'#ffffff',
			correctLevel:QRCode.CorrectLevel.H
		});
		qrcode.clear();
		qrcode.makeCode(content);
}