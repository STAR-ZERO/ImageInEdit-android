# ImageInEdit

## 概要
画像を挿入できるEditText


## 使い方
### リソースIDの画像を挿入
    mImageEdit = (ImageInEdit) findViewById(R.id.image_edit);
    mImageEdit.insertResourceImage(SampleActivity.this, R.drawable.sample);


### assetsの画像を挿入
    mImageEdit = (ImageInEdit) findViewById(R.id.image_edit);
    mImageEdit.insertAssetsImage(SampleActivity.this, "sample.png");


詳しくはサンプル参照



## サンプルイメージ
![sample_image](http://cdn-ak.f.st-hatena.com/images/fotolife/S/STAR_ZERO/20120905/20120905121236_original.png)

