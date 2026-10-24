Function D2BX6282D%(arg0.TX2BF6X0FF4)
    Local local0%
    If (arg0\Field10 <> Null) Then
        Return $00
    EndIf
    arg0\Field10 = (New X600BFXZ6F)
    arg0\Field10\Field4 = 1.0
    arg0\Field10\Field0 = 1.0
    arg0\Field10\Field1 = $00
    arg0\Field10\Field7[$00] = E84DB8F4F(ZDZ642Z20(TX2XZFFZXB4(), D2XFF4X62()), $08)
    arg0\Field10\Field7[$01] = E84DB8F4F(ZDZ642Z20(TX2XZFFZXB4(), D2XFF4X62()), $00)
    arg0\Field10\Field7[$02] = E84DB8F4F(ZDZ642Z20(TX2XZFFZXB4(), D2XFF4X62()), $00)
    For local0 = $00 To $02 Step $01
        TXB86X4FDDF(arg0\Field10\Field7[local0], $08, 2.0)
        XZX4602FF0(arg0\Field10\Field7[local0], $00)
    Next
    D4F4004D(XZX2DX4FF6(arg0, $01, $07), 1802.91, 31.409, 11.925)
    Return $00
End Function
