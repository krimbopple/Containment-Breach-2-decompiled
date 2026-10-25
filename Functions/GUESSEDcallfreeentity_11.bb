Function GUESSEDcallfreeentity_11%(arg0.TX2BF6X0FF4)
    Local local0%
    For local0 = $00 To $05 Step $01
        GUESSEDfreeentity_11(arg0, local0)
        Delete arg0\Field43[local0]
    Next
    Return $01
    Return $00
End Function
