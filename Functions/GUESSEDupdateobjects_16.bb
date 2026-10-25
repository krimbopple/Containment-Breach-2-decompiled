Function GUESSEDupdateobjects_16%(arg0.T484FFBZX, arg1.TX2BF6X0FF4)
    Local local0%
    For local0 = $00 To $05 Step $01
        GUESSEDsetbank(arg0, arg1\Field43[local0]\Field2)
        If (len(arg1\Field43[local0]\Field2) > $00) Then
            GUESSEDsetbank(arg0, arg1\Field43[local0]\Field7)
            GUESSEDsetpoke_4(arg0, arg1\Field43[local0]\Field5)
            GUESSEDsetpoke_4(arg0, arg1\Field43[local0]\Field4)
            GUESSEDsetpoke_4(arg0, arg1\Field43[local0]\Field8)
            GUESSEDsetpoke_2(arg0, arg1\Field43[local0]\Field0)
            GUESSEDsetpoke_2(arg0, arg1\Field43[local0]\Field3)
        EndIf
    Next
    Return $00
End Function
