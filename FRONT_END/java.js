window.watsonAssistantChatOptions = {
    integrationID: "39ee59ab-a1d8-4ca2-85ab-9b89e6c9af96", // The ID of this integration.
    region: "us-south", // The region your integration is hosted in.
    serviceInstanceID: "c90d44fa-9b49-4193-933c-c8735a66bc67", // The ID of your service instance.
    onLoad: function(instance) { instance.render(); }
  };
  setTimeout(function(){
    const t=document.createElement('script');
    t.src="https://web-chat.global.assistant.watson.appdomain.cloud/versions/" + (window.watsonAssistantChatOptions.clientVersion || 'latest') + "/WatsonAssistantChatEntry.js";
    document.head.appendChild(t);
  });
</script>
