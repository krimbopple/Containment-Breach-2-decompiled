Function TFXFX0FZ2%(arg0.XZ0FBD6000)
    Local local1$
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (arg0\Field3 <> $00) Then
        Select arg0\Field21
            Case $02
                local1 = trim(fileextension(arg0\Field11))
                If (local1 <> "webm") Then
                    freeimage(arg0\Field3)
                Else
                    closemovie(arg0\Field3)
                EndIf
            Case $06
                freeeffect(arg0\Field3)
        End Select
    EndIf
    TX0DFFXFDD8($01, arg0\Field5, arg0, $FFFFFFFF)
    Delete arg0
    Return $00
End Function
