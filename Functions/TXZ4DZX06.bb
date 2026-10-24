Function TXZ4DZX06%(arg0.T484FFBZX, arg1.TX2BF6X0FF4)
    Local local0%
    For local0 = $00 To $05 Step $01
        ZXBBD60DX(arg0, arg1\Field43[local0]\Field2)
        If (len(arg1\Field43[local0]\Field2) > $00) Then
            ZXBBD60DX(arg0, arg1\Field43[local0]\Field7)
            XB2Z2BB046(arg0, arg1\Field43[local0]\Field5)
            XB2Z2BB046(arg0, arg1\Field43[local0]\Field4)
            XB2Z2BB046(arg0, arg1\Field43[local0]\Field8)
            TXBFB002B8X(arg0, arg1\Field43[local0]\Field0)
            TXBFB002B8X(arg0, arg1\Field43[local0]\Field3)
        EndIf
    Next
    Return $00
End Function
