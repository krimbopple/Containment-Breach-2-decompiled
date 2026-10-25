Function hideroomscoll%(arg0.rooms)
    Local local0%
    Local local1%
    Local local2%
    Local local3.props
    Local local4.doors
    Local local5.securitycams
    Local local6.levers
    Local local7.screens
    Local local8.X4X6Z4D6F2
    If (arg0\Field4 = $00) Then
        For local3 = Each props
            If (local3\Field5 = arg0) Then
                entityalpha(local3\Field0, 0.0)
            EndIf
        Next
        For local4 = Each doors
            If (local4\Field32 = arg0) Then
                GUESSEDgetentity_2(local4, 0.0)
            EndIf
        Next
        For local5 = Each securitycams
            If (local5\Field6 = arg0) Then
                If (local5\Field15 <> $00) Then
                    If (local5\Field5 = $00) Then
                        hideentity(local5\Field15)
                        entityalpha(local5\Field15, 0.0)
                        entityalpha(local5\Field3, 0.0)
                        entityalpha(local5\Field22, 0.0)
                    EndIf
                EndIf
                If (local5\Field10 = $00) Then
                    hideentity(local5\Field7)
                    hideentity(local5\Field0)
                    entityalpha(local5\Field7, 0.0)
                    entityalpha(local5\Field0, 0.0)
                EndIf
            EndIf
        Next
        For local6 = Each levers
            If (local6\Field2 = arg0) Then
                hideentity(local6\Field1)
                hideentity(local6\Field0)
                entityalpha(local6\Field1, 0.0)
                entityalpha(local6\Field0, 0.0)
            EndIf
        Next
        For local7 = Each screens
            If (local7\Field12 = arg0) Then
                hideentity(local7\Field10)
                entityalpha(local7\Field10, 0.0)
            EndIf
        Next
        For local0 = $00 To $1D Step $01
            If (arg0\Field27[local0] <> $00) Then
                If (arg0\Field30[local0] = $00) Then
                    hideentity(arg0\Field27[local0])
                    If (entityclass(arg0\Field27[local0]) <> "Pivot") Then
                        arg0\Field18[local0] = getentityalpha(arg0\Field27[local0])
                        arg0\Field33[local0] = $01
                        entityalpha(arg0\Field27[local0], 0.0)
                    EndIf
                EndIf
            EndIf
        Next
        For local8 = Each X4X6Z4D6F2
            If (local8\Field3 = arg0) Then
                GUESSEDdeleteentity(local8)
            EndIf
        Next
        entityalpha(getchild(arg0\Field15, $02), 0.0)
        arg0\Field4 = $01
        Return $01
    EndIf
    Return $00
    Return $00
End Function
