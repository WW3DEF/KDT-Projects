// 문자열의 바이트 길이 반환
export function getBytesSize(str){
    const encoder = new TextEncoder();
    const byteArray = encoder.encode(str);
    return byteArray.length;
  }
