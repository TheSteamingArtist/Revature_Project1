let baseUrl = "http://localhost:8070";


async function charactercreate()
{
    console.log("Character Created");

    let firstN = document.getElementById('firstN').value;

    let lastN = document.getElementById('lastName').value;

    let typeOfC = document.getElementById('characterType').value;


    let form =
    {
        firstName : firstN,
        lastName : lastN,
        typeOfCharacter : typeOfC
    }

    console.log(form);

    let formJson = JSON.stringify(form);

    console.log(formJson);

    let res = await fetch(
                            `${baseUrl}/submit`,
                            {
                                method : 'POST',
                                header : {'Content-Type' : 'application/json'},
                                body : formJson
                            }


    );

    let resJson = await res.json().then((resp) => {
        console.log(resp);
        window.location.assign("ActivityPage.html");
    })

    .catch((error) =>
    {
        console.log(error);
    });
}

async function activityCreate()
{
    console.log("Activity created");

    let activityName = document.getElementById('typeOfActivity').value;

    let improvIdentification = document.getElementById('characterId').value;

    let activityform =
    {
        typeOfActivity : activityName,
        improvid : improvIdentification
    }

    console.log(activityform);

    let activityformJson = JSON.stringify(activityform);

    console.log(activityformJson);

    let res = await fetch(
                            `${baseUrl}/submit/activity`,
                            {
                                method : `POST`,
                                header : {'Content-Type' : 'application/json'},
                                body : activityformJson
                            }
    );

    let resJson = await res.json().then((resp) => {
        console.log(resp);
        window.location.assign("SettingPage.html");
    })

    .catch((error) =>
    {
        console.log(error);
    });
}