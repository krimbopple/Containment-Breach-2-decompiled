Function GUESSEDloadmask%(arg0%, arg1%)
    maskentity(arg0, (($0F * arg1) + $01))
    Return $00
End Function
