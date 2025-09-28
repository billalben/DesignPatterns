package me.billal.decorator;

public class EncryptedCloudStream implements Stream {
  private final Stream stream;

  public EncryptedCloudStream(Stream stream) {
    this.stream = stream;
  }

  @Override
  public void write(String data) {
    var encrypted = encrypt(data);
    stream.write(encrypted);
  }

  private String encrypt(String data) {
    return "!@#$(!@#*()*)(*!@#";
  }
}
