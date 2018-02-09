
/**
 * 绘制二维码 div的id-内容-宽-高
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