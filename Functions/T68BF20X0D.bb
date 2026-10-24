Function T68BF20X0D%(arg0%, arg1%)
    Local local0%
    Local local1%
    For local0 = $00 To $04 Step $01
        If (local0 <> arg1) Then
            TXFD22D0402\Field4[local0] = $00
        EndIf
    Next
    TXFD22D0402\Field2 = arg1
    TXFD22D0402\Field4[arg1] = (TXFD22D0402\Field4[arg1] + $01)
    If (TXFD22D0402\Field4[arg1] > $02) Then
        TXFD22D0402\Field4[arg1] = $00
    EndIf
    B24D0X6Z8(arg0)
    If (TXFD22D0402\Field4[arg1] = $00) Then
        Return $00
    EndIf
    local1 = B24D0X6Z8(arg0)
    Select arg1
        Case $00
            For local0 = $00 To (local1 - $01) Step $01
                Y8684BFX8((Handle TXX0F66ZBZF[local0]), TXX0F66ZBZF[local0]\Field11)
            Next
            Y2680FB8Z((TXFD22D0402\Field4[arg1] = $02))
        Case $01
            For local0 = $00 To (local1 - $01) Step $01
                Y8684BFX8((Handle TXX0F66ZBZF[local0]), TXX0F66ZBZF[local0]\Field21)
            Next
            Y2680FB8Z((TXFD22D0402\Field4[arg1] = $02))
        Case $02
            For local0 = $00 To (local1 - $01) Step $01
                T8422242FZ((Handle TXX0F66ZBZF[local0]), TXX0F66ZBZF[local0]\Field20)
            Next
            CXZX0802D((TXFD22D0402\Field4[arg1] = $02))
        Case $03
            For local0 = $00 To (local1 - $01) Step $01
                T8422242FZ((Handle TXX0F66ZBZF[local0]), TXX0F66ZBZF[local0]\Field25)
            Next
            CXZX0802D((TXFD22D0402\Field4[arg1] = $02))
    End Select
    For local0 = $00 To (local1 - $01) Step $01
        TXX0F66ZBZF[local0] = (Object.T402X2Z846 TX82B0ZZ688(local0))
    Next
    T2DBZ0FB8B()
    Return $00
End Function
